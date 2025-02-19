package middlewareapd.exception;

/**
 * Exception thrown when a user is not found in the database MockJWTRepository.
 * This is a runtime exception that extends {@link RuntimeException}.
 */
public class UserNotFoundException extends RuntimeException {

    /**
     * Constructs a new {@code UserNotFoundException} with the specified detail message.
     *
     * @param message the detail message, which is saved for later retrieval by the {@link Throwable#getMessage()} method
     */
    public UserNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code UserNotFoundException} with the specified detail message and cause.
     *
     * @param message the detail message, which is saved for later retrieval by the {@link Throwable#getMessage()} method
     * @param cause the cause (which is saved for later retrieval by the {@link Throwable#getCause()} method)
     */
    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

