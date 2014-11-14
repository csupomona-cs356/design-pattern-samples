package cs356.csupomona.edu.commandpatterndemo.command;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by yusun on 11/13/14.
 */
public class UpdateEditCommand extends EditCommand {

    private Context context;
    private ViewGroup container;

    private String oldText;
    private String newText;
    private View updatedView;

    public UpdateEditCommand(Context context, ViewGroup container) {
        this.container = container;
        this.context = context;
    }

    @Override
    public void execute() {
        if (updatedView == null) {
            int size = container.getChildCount();
            updatedView = container.getChildAt(generateInt(size));
            newText = generateString();
            oldText = ((EditText) updatedView).getText().toString();
        }

        ((EditText) updatedView).setText(newText);
    }

    @Override
    public void undo() {
        ((EditText) updatedView).setText(oldText);
    }
}
