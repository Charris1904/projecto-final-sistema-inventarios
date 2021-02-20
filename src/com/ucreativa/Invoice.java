package com.ucreativa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Invoice {
    private Contact contact;
    private String documentNumber;
    private String date;
    private String dueDate;
    private String filePath;
    private List<Item> items;
    private String purchaseMessage;
    private Map<String, String> customFields;

    private Category category;
    private String internalDescription;
    private String[] tags;
    private Map<Project, Item> projectsByItem;
    private boolean isDraft;

    public Invoice() {
    }

    public Invoice(Contact contact, String documentNumber, String date, String dueDate, String filePath, List<Item> items, String purchaseMessage, Map<String, String> customFields, Category category, String internalDescription, String[] tags, Map<Project, Item> projectsByItem, boolean isDraft) {
        this.contact = contact;
        this.documentNumber = documentNumber;
        this.date = date;
        this.dueDate = dueDate;
        this.filePath = filePath;
        this.items = items;
        this.purchaseMessage = purchaseMessage;
        this.customFields = customFields;
        this.category = category;
        this.internalDescription = internalDescription;
        this.tags = tags;
        this.projectsByItem = projectsByItem;
        this.isDraft = isDraft;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "contact=" + contact +
                ", documentNumber='" + documentNumber + '\'' +
                ", date='" + date + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", filePath='" + filePath + '\'' +
                ", items=" + items +
                ", purchaseMessage='" + purchaseMessage + '\'' +
                ", customFields=" + customFields +
                ", category=" + category +
                ", internalDescription='" + internalDescription + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", projectsByItem=" + projectsByItem +
                ", isDraft=" + isDraft +
                '}';
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getPurchaseMessage() {
        return purchaseMessage;
    }

    public void setPurchaseMessage(String purchaseMessage) {
        this.purchaseMessage = purchaseMessage;
    }

    public Map<String, String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, String> customFields) {
        this.customFields = customFields;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getInternalDescription() {
        return internalDescription;
    }

    public void setInternalDescription(String internalDescription) {
        this.internalDescription = internalDescription;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Map<Project, Item> getProjectsByItem() {
        return projectsByItem;
    }

    public void setProjectsByItem(Map<Project, Item> projectsByItem) {
        this.projectsByItem = projectsByItem;
    }

    public boolean isDraft() {
        return isDraft;
    }

    public void setDraft(boolean draft) {
        isDraft = draft;
    }
}