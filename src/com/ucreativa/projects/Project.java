package com.ucreativa.projects;

import com.ucreativa.contact.Contact;

import java.util.List;

public class Project {
    private  int idProject;
    private String name;
    private String color;
    private String icon;
    private String template;
    private String status;
    private String privacy;
    private String startDate;
    private String endDate;
    private boolean sendNotifications;
    private boolean acceptAutomatically;
    private String key;
    private boolean createTaskOnlyThroughForms;
    private Contact contact;
    private List<String> tags;

    public Project(int idProject, String name, String color, String icon, String template, String status, String privacy,
                   String startDate, String endDate, boolean sendNotifications, boolean acceptAutomatically, String key,
                   boolean createTaskOnlyThroughForms, Contact contact, List<String> tags) {
        this.idProject = idProject;
        this.name = name;
        this.color = color;
        this.icon = icon;
        this.template = template;
        this.status = status;
        this.privacy = privacy;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sendNotifications = sendNotifications;
        this.acceptAutomatically = acceptAutomatically;
        this.key = key;
        this.createTaskOnlyThroughForms = createTaskOnlyThroughForms;
        this.contact = contact;
        this.tags = tags;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isSendNotifications() {
        return sendNotifications;
    }

    public void setSendNotifications(boolean sendNotifications) {
        this.sendNotifications = sendNotifications;
    }

    public boolean isAcceptAutomatically() {
        return acceptAutomatically;
    }

    public void setAcceptAutomatically(boolean acceptAutomatically) {
        this.acceptAutomatically = acceptAutomatically;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isCreateTaskOnlyThroughForms() {
        return createTaskOnlyThroughForms;
    }

    public void setCreateTaskOnlyThroughForms(boolean createTaskOnlyThroughForms) {
        this.createTaskOnlyThroughForms = createTaskOnlyThroughForms;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Project{" +
                "idProject=" + idProject +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", icon='" + icon + '\'' +
                ", template='" + template + '\'' +
                ", status='" + status + '\'' +
                ", privacy='" + privacy + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", sendNotifications=" + sendNotifications +
                ", acceptAutomatically=" + acceptAutomatically +
                ", key='" + key + '\'' +
                ", createTaskOnlyThroughForms=" + createTaskOnlyThroughForms +
                ", contact=" + contact +
                ", tags=" + tags +
                '}';
    }

    /**
     * @return The days between the current date and endDate
     */
    public int showRemainingDays(){
        System.out.println("There are X days until the deadline, hurry up!");
        return 0;
    }
}
