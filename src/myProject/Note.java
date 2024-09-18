package myProject;
import java.util.ArrayList;
import java.util.Scanner;

public class Note {
    class Task {
        private String name;
        private boolean isCompleted;

        public Task(String name) {
            this.name = name;
            this.isCompleted = false;
        }

        public String getName() {
            return name;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public void markAsCompleted() {
            this.isCompleted = true;
        }

        @Override
        public String toString() {
            return name + (isCompleted ? " (완료)" : " (미완료)");
        }
    }

    class ToDoList {
        private ArrayList<Task> tasks;

        public ToDoList() {
            tasks = new ArrayList<>();
        }

        public void addTask(String taskName) {
            tasks.add(new Task(taskName));
            System.out.println("'" + taskName + "' 할 일이 추가되었습니다.");
        }

        public void viewTasks() {
            if (tasks.isEmpty()) {
                System.out.println("할 일이 없습니다.");
            } else {
                System.out.println("할 일 목록:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }
        }

        public void deleteTask(int taskIndex) {
            if (taskIndex >= 0 && taskIndex < tasks.size()) {
                System.out.println("'" + tasks.get(taskIndex).getName() + "' 할 일이 삭제되었습니다.");
                tasks.remove(taskIndex);
            } else {
                System.out.println("잘못된 인덱스입니다.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Note note = new Note();  // Note 클래스의 인스턴스 생성
        ToDoList toDoList = note.new ToDoList();  // 내부 클래스 ToDoList 인스턴스 생성

        while (true) {
            System.out.println("\n1. 할 일 추가");
            System.out.println("2. 할 일 목록 보기");
            System.out.println("3. 할 일 삭제");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("추가할 할 일: ");
                    String taskName = sc.nextLine();
                    toDoList.addTask(taskName);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.print("삭제할 할 일 번호: ");
                    int deleteIndex = sc.nextInt() - 1;
                    toDoList.deleteTask(deleteIndex);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다;");
            }
        }
    }
}