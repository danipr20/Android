package infoii.dpr20.tasklist;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Map<String, List<String>> taskLists; // Mapa para almacenar las listas y sus tareas
    private ArrayAdapter<String> tasksAdapter; // Adaptador para las tareas
    private ArrayAdapter<String> listsAdapter; // Adaptador para las listas
    private Spinner listsSpinner;
    private ListView tasksListView;
    private EditText newListEditText;
    private EditText newTaskEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar variables y adaptadores
        taskLists = new HashMap<>();
        newListEditText = findViewById(R.id.newListEditText);
        newTaskEditText = findViewById(R.id.newTaskEditText);
        listsSpinner = findViewById(R.id.listsSpinner);
        tasksListView = findViewById(R.id.tasksListView);

        // Configurar adaptador para el Spinner de listas
        listsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new ArrayList<>(taskLists.keySet()));
        listsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listsSpinner.setAdapter(listsAdapter);

        // Configurar adaptador para la lista de tareas
        tasksAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<>());
        tasksListView.setAdapter(tasksAdapter);

        // Botón para agregar lista
        Button addListButton = findViewById(R.id.addListButton);
        addListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newListName = newListEditText.getText().toString();
                if (!newListName.isEmpty()) {
                    addNewList(newListName);
                    updateListsSpinner();
                    newListEditText.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Ingrese el nombre de la lista", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Botón para agregar tarea a la lista seleccionada
        Button addTaskButton = findViewById(R.id.addTaskButton);
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newTask = newTaskEditText.getText().toString();
                String selectedListName = listsSpinner.getSelectedItem().toString();
                if (!newTask.isEmpty()) {
                    addNewTask(selectedListName, newTask);
                    updateTasksList(selectedListName);
                    newTaskEditText.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Ingrese el nombre de la tarea", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Agregar una nueva lista
    private void addNewList(String newListName) {
        if (!taskLists.containsKey(newListName)) {
            taskLists.put(newListName, new ArrayList<>());
        }
    }

    // Agregar una nueva tarea a una lista existente
    private void addNewTask(String listName, String newTask) {
        List<String> tasks = taskLists.get(listName);
        if (tasks != null) {
            tasks.add(newTask);
            taskLists.put(listName, tasks);
        }
    }

    // Actualizar el Spinner de listas
    private void updateListsSpinner() {
        listsAdapter.clear();
        listsAdapter.addAll(new ArrayList<>(taskLists.keySet()));
        listsAdapter.notifyDataSetChanged();
    }

    // Actualizar la lista de tareas mostradas según la lista seleccionada
    private void updateTasksList(String selectedListName) {
        List<String> tasks = taskLists.get(selectedListName);
        if (tasks != null) {
            tasksAdapter.clear();
            tasksAdapter.addAll(tasks);
            tasksAdapter.notifyDataSetChanged();
        }
    }
}