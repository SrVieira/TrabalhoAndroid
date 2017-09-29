package matheusv.com.todolist.db;

import android.provider.BaseColumns;

/**
 * @author Matheus Vieira
 * @since 29/09/2017
 * @version  1.0
 */
public class TaskContract {

    public static final String DB_NAME = "matheusv.com.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }

}
