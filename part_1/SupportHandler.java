package part_1;

public interface SupportHandler {
    void setNext(SupportHandler nextHandler);
    void handle(String issue);
}
