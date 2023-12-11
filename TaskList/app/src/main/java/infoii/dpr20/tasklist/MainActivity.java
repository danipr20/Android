package infoii.dpr20.tasklist;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class MainActivity extends AppCompatActivity {
    //Este mapa es el encargado de almacenar todos los datos introducidos por
    //el usuario, de manera ordenada. El primero elemento String que almacena, es
    //una clave; que recibe el nombre de la lista agregada por el usuario; y cada
    //clave presenta una lista de strings para guardar los valores asociados a la
    //clave anterior. Ej: Clave="Comida" --> Valor=[Arroz,Tomate,Manzanas,...]
    private Map<String, List<String>> taskLists;

    //Este objeto tasksAdapter es el encargado de tomar la lista de tareas(tasks),
    //y presentarlas en pantalla de manera ordenada.
    private ArrayAdapter<String> tasksAdapter;

    //Este objeto listsAdapter es el encargado de acceder a las listas creadas y
    //alamcenadas como claves dentro taskLists; para representarlas dentro del Spinner
    private ArrayAdapter<String> listsAdapter;

    //El objeto Spinner es un componenete visual, que permite al usuario seleccionar
    //una de las listas disponibles
    private Spinner listsSpinner;

    //Objetos para la visualización en pantalla de las listas y textos
    private ListView tasksListView;
    private EditText newListEditText;
    private EditText newTaskEditText;

    private LinearLayout tasksLinearLayout; //Para poder personalizar el layout y añadir los CheckBox

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

        //Añadir el Layout para la lista de tareas
        tasksLinearLayout = findViewById(R.id.listsAndTasksSection);

        // Botón para agregar lista
        Button addListButton = findViewById(R.id.addListButton);
        addListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newListName = newListEditText.getText().toString(); //Guardo el texto introducido en la variable newListName

                //Si el texto introducido no está vacío, añado el nombre a la lista y actualizo el desplegable Spinner
                if (!newListName.isEmpty()) {
                    addNewList(newListName);
                    updateListsSpinner();
                    newListEditText.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Ingrese el nombre de la lista", Toast.LENGTH_SHORT).show();
                }
            }
        });



////////////
// Botón para eliminar lista seleccionada
        Button remListButton = findViewById(R.id.remListButton);
        remListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    String selectedListName = listsSpinner.getSelectedItem().toString();
                    removeList(selectedListName);
                    updateListsSpinner();
                    try{
                    selectedListName = listsSpinner.getSelectedItem().toString();
                    updateTasksList(selectedListName);}catch (Exception e){}
                }catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error al eliminar la lista, compruebe que existe  lista.", Toast.LENGTH_SHORT).show();
                }

            }
        });
///////////////////


        // Botón para agregar tarea a la lista seleccionada
        Button addTaskButton = findViewById(R.id.addTaskButton);
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String newTask = newTaskEditText.getText().toString();
                    String selectedListName = listsSpinner.getSelectedItem().toString();

                    if (!newTask.isEmpty()) {
                        addNewTask(selectedListName, newTask);
                        updateTasksList(selectedListName);
                        newTaskEditText.setText("");
                    } else {
                        Toast.makeText(MainActivity.this, "Ingrese el nombre de la tarea", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Se produjo un error al agregar la tarea.", Toast.LENGTH_SHORT).show();
                }
            }
        });



    // Botón para eliminar todas las tareas de la lista seleccionada
    Button remTaskButton = findViewById(R.id.remTaskButton);
remTaskButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
            String selectedListName = listsSpinner.getSelectedItem().toString();
            removeTask(selectedListName);
            updateTasksList(selectedListName);
            } catch (Exception e){
                Toast.makeText(MainActivity.this, "Error al borrar tareas.", Toast.LENGTH_SHORT).show();
            }
        }
    });

    }





    // Agregar una nueva lista
    private void addNewList(String newListName)
    {
        if (!taskLists.containsKey(newListName))
        {
            taskLists.put(newListName, new ArrayList<>());
        }
    }



    //Eliminar lista
    private void removeList(String listName) {
        if (taskLists.containsKey(listName)) {
            taskLists.remove(listName);
        }
    }




   /// Agregar una nueva tarea a una lista existente
    private void addNewTask(String listName, String newTask) {
        List<String> tasks = taskLists.get(listName);
        if (tasks != null) {
            tasks.add(newTask);
            taskLists.put(listName, tasks);
        }
    }




    // Eliminar las tareas de una lista
    private void removeTask(String listName) {
        List<String> tasks = taskLists.get(listName);
        if (tasks != null) {
            tasks.clear();
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

}//Fin de MainActivity