package cs356.csupomona.edu.commandpatterndemo.command;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by yusun on 11/14/14.
 */
public class AddCommand implements Command {

    private Context context;
    private LinearLayout container;

    private EditText editText;

    public AddCommand(Context context, LinearLayout container) {
        this.context = context;
        this.container = container;
    }

    @Override
    public void execute() {
        if (editText == null) {
            editText = new EditText(context);
            editText.setText("Auto-generated Text");
            container.addView(editText);
        } else {
            container.addView(editText);
        }
    }

    @Override
    public void unexecute() {
        container.removeView(editText);
    }
}
