package cs356.csupomona.edu.commandpatterndemo.command;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yusun on 11/13/14.
 */
public class DeleteEditCommand extends EditCommand {

    private Context context;
    private ViewGroup container;

    private int position;
    private View deletedView;

    public DeleteEditCommand(Context context, ViewGroup container) {
        this.container = container;
        this.context = context;
    }

    @Override
    public void execute() {
        if (deletedView == null) {
            int size = container.getChildCount();
            position = generateInt(size);
            deletedView = container.getChildAt(position);
        }
        container.removeView(deletedView);
    }

    @Override
    public void undo() {
        container.addView(deletedView, position);
    }
}
