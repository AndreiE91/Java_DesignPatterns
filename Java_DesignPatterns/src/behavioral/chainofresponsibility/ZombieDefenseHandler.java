package behavioral.chainofresponsibility;

interface ZombieDefenseHandler {
    void handleAttack(int zombiesCount);
    void setNextHandler(ZombieDefenseHandler nextHandler);
}
