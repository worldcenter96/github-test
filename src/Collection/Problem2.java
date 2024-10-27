package Collection;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

        // 1. 자료 구조 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("저장할 자료구조명을 입력해주세요(List / Set / Map): ");
        String structure = sc.nextLine();

        // 2. 요리 제목 입력
        System.out.print("요리 제목을 입력해주세요: ");
        String title = sc.nextLine();


        // 3. 요리 재료 입력
        ArrayList<String> listIngredients = new ArrayList<String>();
        Set<String> setIngredients = new LinkedHashSet<String>();
        Map<Integer, String> mapIngredients = new HashMap<Integer, String>();
        String end = "끝";
        System.out.println("재료를 입력해주세요: ");

        if (structure.equals("List")) {
            while (true) {
                String recipe = sc.nextLine();
                if (recipe.equals(end)) {
                    break;
                }
                listIngredients.add(recipe);
            }

        } else if (structure.equals("Set")) {
            while (true) {
                String recipe = sc.nextLine();
                if (recipe.equals(end)) {
                    break;
                }
                setIngredients.add(recipe);
            }

        } else if (structure.equals("Map")) {
            int i = 1;
            while (true) {
                String recipe = sc.nextLine();
                if (recipe.equals(end)) {
                    break;
                }
                mapIngredients.put(i, recipe);
                i++;
            }

        } else {
            System.out.println("잘못된 입력입니다.");
        }

        // 4. 출력
        System.out.println("[ " + structure + " 으로 저장된 " + title + " ]");
        if (structure.equals("List")) {
            for (int i = 0; i < listIngredients.size(); i++) {
                System.out.println((i + 1) + ". " + listIngredients.get(i));
            }
        } else if (structure.equals("Set")) {
            for (int i = 0; i < setIngredients.size(); i++) {
                System.out.println((i + 1) + ". " + setIngredients.toArray()[i]);
            }
        } else if (structure.equals("Map")) {
            for (int key : mapIngredients.keySet()) {
                System.out.println(key + ". " + mapIngredients.get(key));

            }
        }


    }
}
