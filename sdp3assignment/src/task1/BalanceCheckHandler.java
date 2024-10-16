package task1;

class BalanceCheckHandler extends Handler {
    @Override
    public String handle(Request request) {
        if (request.getClientBalance() >= request.getRequiredBalance()) {
            return handleNext(request);
        }
        return "Insufficient balance.";
    }
}
