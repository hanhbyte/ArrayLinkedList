public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mai");
        list.add("là");
        list.add("chủ");
        list.add("nhật");

        print(list.getData());
        System.out.println(list.indexOf("không"));
        System.out.println(list.indexOf("được"));
        list.remove(1);
        list.add("1 phút",1);
        print(list.getData());
        ArrayList<String> clone = list.clone();
        System.out.println(clone.contains("nghỉ"));
        System.out.println(clone.contains("ngơi"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }

}
