package cs356.csupomona.edu.commandpatterndemo.command;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;

import cs356.csupomona.edu.commandpatterndemo.util.RandomUtil;

/**
 * Created by yusun on 11/14/14.
 */
public class DeleteCommand implements Command {

    private Context context;
    private LinearLayout container;

    private EditText editText;
    private int index;

    public DeleteCommand(Context context, LinearLayout container) {
        this.context = context;
        this.container = container;
    }

    @Override
    public void execute() {
        if (editText == null) {
            int size = container.getChildCount();
            index = RandomUtil.generateInt(size);
            editText = (EditText) container.getChildAt(index);
            container.removeView(editText);
        } else {
            container.removeView(editText);
        }
    }

    @Override
    public void unexecute() {
        container.addView(editText, index);
    }
}
