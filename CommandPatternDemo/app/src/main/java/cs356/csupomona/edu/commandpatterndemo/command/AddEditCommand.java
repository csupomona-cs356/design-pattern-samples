package cs356.csupomona.edu.commandpatterndemo.command;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by yusun on 11/13/14.
 */
public class AddEditCommand extends EditCommand {

    private Context context;
    private LinearLayout container;

    private Integer addedPosition;
    private EditText addedView;

    public AddEditCommand(Context context, LinearLayout container) {
        this.container = container;
        this.context = context;
    }

    @Override
    public void execute() {
        if (addedView == null) {
            addedView = new EditText(context);
            addedView.setText("Auto-Generated EditText - " + generateInt(100));
            container.addView(addedView);
            addedPosition = container.getChildCount() - 1;
        } else {
            container.addView(addedView, addedPosition);
        }
    }

    @Override
    public void undo() {
        container.removeView(addedView);
    }
}
