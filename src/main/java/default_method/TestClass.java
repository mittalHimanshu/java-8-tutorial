package default_method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestClass implements TestInterface {

    private Logger logger = LogManager.getLogger(TestClass.class);

    @Override
    public void square(int a) {
        logger.info(a);
    }

    void voidTestDefault(){
        TestClass d = new TestClass();
        d.square(2);
        d.show();
    }

}
