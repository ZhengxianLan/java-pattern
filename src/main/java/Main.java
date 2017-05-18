import com.lan.strategy.StrategyFactory;
import com.lan.validator.Validator;

/**
 * Created by lan on 2017/5/17.
 */
public class Main {
    public static void main(String[] args) {
        String target = "sdfdf";
        Validator validator = new Validator();
        validator.add(target, StrategyFactory.isNum(),"不是数字");
        validator.start();
    }
}
