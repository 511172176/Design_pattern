//Facade模式實現
//管理所有建築工程

import java.util.LinkedList;
import java.util.Queue;

public class BuildingQueue {
    private Queue<String> buildingQueue;

    public BuildingQueue() {
        buildingQueue = new LinkedList<>();
    }

    public void addBuilding(String buildingType) {
        buildingQueue.offer(buildingType);
        System.out.println(buildingType + " added to the building queue.");
    }

    // 可以添加處理建築隊列的方法，例如定期檢查和開始建造
}
