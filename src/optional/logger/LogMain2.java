package optional.logger;

public class LogMain2 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(value100() + value200());

        System.out.println("[Debug Mode Off]");
        logger.setDebug(false);
        logger.debug(value100() + value200());

        System.out.println("[Debug Mode Check]");
        if(logger.isDebug()){
            logger.debug(value100() + value200());
        }
    }
    static int value100(){
        System.out.println("Value 100 call");
        return 100;
    }
    static int value200(){
        System.out.println("Value 200 call");
        return 200;
    }
}
