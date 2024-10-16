package task1;

class LocationCheckHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.isLocationServiceable()) {
            return handleNext(request);
        }
        return "Location not serviceable.";
    }
}
