package route;

import com.jfinal.core.Controller;

/**
 * Created by Fooker on 2016/7/17.
 */
public class IndexController extends Controller {
    public void index(){
        render("index.jsp");
    }
}
