package task1;

class CarAvailabilityHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.isCarAvailable()) {
            return handleNext(request);
        }
        return "No cars available.";
    }
}
