package zhukdi_Airline.github.com;

/**
 * Created by Админ on 13.04.2017.
 */
public class AircraftLogicException extends Exception {
    public AircraftLogicException() {
    }

    public AircraftLogicException(String message, Throwable exception) {
        super(message, exception);
    }

    public AircraftLogicException(String message) {
        super(message);
    }

    public AircraftLogicException(Throwable exception) {
        super(exception);
    }

}
