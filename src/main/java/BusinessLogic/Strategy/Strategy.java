package BusinessLogic.Strategy;

import Model.Client;
import Model.Queue;

import java.util.List;

public interface Strategy {
    public void addClient(List<Queue> queueList, Client c);
}