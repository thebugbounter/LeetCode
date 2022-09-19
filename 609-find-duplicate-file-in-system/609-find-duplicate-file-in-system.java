public class Solution {

    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();//key is the file content, value is the list of directories that has this directory/file
        for (String path : paths) {
            String[] dirAndFiles = path.split(" ");
            for (int i = 1; i < dirAndFiles.length; i++) {
                String content = dirAndFiles[i].substring(dirAndFiles[i].indexOf("(") + 1, dirAndFiles[i].indexOf(")"));
                if (!map.containsKey(content)) {
                    map.put(content, new ArrayList<>());
                }
                List<String> dirs = map.get(content);
                dirs.add(dirAndFiles[0] + "/" + dirAndFiles[i].substring(0, dirAndFiles[i].indexOf("(")));
                map.put(content, dirs);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (String content : map.keySet()) {
            if (map.get(content).size() > 1) {
                List<String> dupFile = new ArrayList<>();
                for (String dir : map.get(content)) {
                    dupFile.add(dir);
                }
                result.add(dupFile);
            }
        }
        return result;
    }
}