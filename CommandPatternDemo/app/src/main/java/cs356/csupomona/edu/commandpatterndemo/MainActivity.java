package cs356.csupomona.edu.commandpatterndemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Stack;

import butterknife.ButterKnife;
import butterknife.InjectView;
import cs356.csupomona.edu.commandpatterndemo.command.AddCommand;
import cs356.csupomona.edu.commandpatterndemo.command.Command;
import cs356.csupomona.edu.commandpatterndemo.command.DeleteCommand;
import cs356.csupomona.edu.commandpatterndemo.command.UpdateCommand;


public class MainActivity extends Activity {


    @InjectView(R.id.undo)
    Button undoButton;

    @InjectView(R.id.redo)
    Button redoButton;

    @InjectView(R.id.addButton)
    Button addButton;

    @InjectView(R.id.updateButton)
    Button updateButton;

    @InjectView(R.id.deleteButton)
    Button deleteButton;

    @InjectView(R.id.container)
    LinearLayout container;

    Stack<Command> history = new Stack<Command>();
    Stack<Command> redoList = new Stack<Command>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        // ADD, UPDATE & DELETE

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Command addCommand = new AddCommand(MainActivity.this, container);
                addCommand.execute();
                history.push(addCommand);
                redoList.clear();
            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Command updateCommand = new UpdateCommand(MainActivity.this, container);
                updateCommand.execute();
                history.push(updateCommand);
                redoList.clear();
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Command deleteCommand = new DeleteCommand(MainActivity.this, container);
                deleteCommand.execute();
                history.push(deleteCommand);
                redoList.clear();
            }
        });


        // UNDO & REDO

        undoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!history.isEmpty()) {
                    Command command = history.pop();
                    command.unexecute();

                    redoList.push(command);
                }
            }
        });


        redoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!redoList.isEmpty()) {
                    Command command = redoList.pop();
                    command.execute();

                    history.push(command);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
