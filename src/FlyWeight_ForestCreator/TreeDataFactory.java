package FlyWeight_ForestCreator;

import java.util.HashMap;

public class TreeDataFactory {
    private static HashMap<TreeType,TreeData> cacheTrees = new HashMap<>();

    public static TreeData getTreeData(TreeType type){
        TreeData treeData = cacheTrees.get(type);
        if(treeData == null){
            if(type == TreeType.TREE){
                treeData = new TreeData("tree", "green", true);
            } else if (type == TreeType.PLANT) {
                treeData = new TreeData("plant", "green", false);
            } else if (type == TreeType.VEIN) {
                treeData = new TreeData("vein", "brown", false);
            }
            cacheTrees.put(type, treeData);
        }
        return treeData;
    }
}
