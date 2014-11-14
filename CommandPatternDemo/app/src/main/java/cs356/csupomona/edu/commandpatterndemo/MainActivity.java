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
import cs356.csupomona.edu.commandpatterndemo.command.AddEditCommand;
import cs356.csupomona.edu.commandpatterndemo.command.DeleteEditCommand;
import cs356.csupomona.edu.commandpatterndemo.command.EditCommand;
import cs356.csupomona.edu.commandpatterndemo.command.UpdateEditCommand;


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

    private Stack<EditCommand> executed = new Stack<EditCommand>();
    private Stack<EditCommand> unexecuted = new Stack<EditCommand>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddEditCommand addEditCommand = new AddEditCommand(MainActivity.this, container);
                addEditCommand.execute();
                executed.push(addEditCommand);
                unexecuted.clear();
            }
        });
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UpdateEditCommand addEditCommand = new UpdateEditCommand(MainActivity.this, container);
                addEditCommand.execute();
                executed.push(addEditCommand);
                unexecuted.clear();
            }
        });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeleteEditCommand addEditCommand = new DeleteEditCommand(MainActivity.this, container);
                addEditCommand.execute();
                executed.push(addEditCommand);
                unexecuted.clear();
            }
        });



        undoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!executed.isEmpty()) {
                    EditCommand lastCommand = executed.pop();
                    if (lastCommand != null) {
                        lastCommand.undo();
                        unexecuted.push(lastCommand);
                    }
                }
            }
        });

        redoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!unexecuted.isEmpty()) {
                    EditCommand lastCommand = unexecuted.pop();
                    if (lastCommand != null) {
                        lastCommand.execute();
                        executed.push(lastCommand);
                    }
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
