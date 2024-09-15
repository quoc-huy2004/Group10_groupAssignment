package UserAndLogin;

public class Task {
    private Employee employee;
    private String description;

    public Task(Employee employee, String description) {
        this.employee = employee;
        this.description = description;
    }

    public Employee getTaskID() {
        return this.employee;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task ID: " + employee + ", Description: " + description;

    }
}

