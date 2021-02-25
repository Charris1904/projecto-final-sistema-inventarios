package com.ucreativa;

import com.ucreativa.contact.Contact;

public class Project {
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
    private String[] tags;

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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
