package project2;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//叶子层

			int level = 10;

			//根层

			int rootLevel = 1;

			int spaceNum = level - 1;

			//画叶子

			// 为什么从1开始 不管了就是任性

			for (int i = 1; i <= level; i++) {

			spaceNum--;

			for (int g = 0; g <= spaceNum; g++) {

			System.out.print(" ");

			}

			for (int j = 1; j <= ((i * 2) -1); j++) {

			System.out.print("*");

			}

			System.out.print("\n");

			}

			System.out.println("  圣诞节快乐");

			//画根

			for (int i = 1; i <= rootLevel; i++) {

			for (int g = 1; g < level; g++) {

			System.out.print(" ");

			}

			System.out.print("*\n");

			}

			}
			
	}

