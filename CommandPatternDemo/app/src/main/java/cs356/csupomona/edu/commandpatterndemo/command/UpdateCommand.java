package cs356.csupomona.edu.commandpatterndemo.command;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;

import cs356.csupomona.edu.commandpatterndemo.util.RandomUtil;

/**
 * Created by yusun on 11/14/14.
 */
public class UpdateCommand implements Command {

    private Context context;
    private LinearLayout container;

    private EditText editText;
    private String oldText;
    private String newText;

    public UpdateCommand(Context context, LinearLayout container) {
        this.context = context;
        this.container = container;
    }

    @Override
    public void execute() {
        if (editText == null) {
            int size = container.getChildCount();
            int index = RandomUtil.generateInt(size);
            editText = (EditText) container.getChildAt(index);
            // store the old text
            oldText = editText.getText().toString();
            // set it to be the new text
            newText = RandomUtil.generateString();
            editText.setText(newText);
        } else {
            editText.setText(newText);
        }
    }

    @Override
    public void unexecute() {
        editText.setText(oldText);
    }
}
