package task1;

abstract class Handler {
    private Handler next;

    public Handler setNext(Handler nextHandler) {
        this.next = nextHandler;
        return nextHandler;
    }

    public abstract String handle(Request request);

    protected String handleNext(Request request) {
        if (next != null) {
            return next.handle(request);
        }
        return "Request accepted";
    }
}
