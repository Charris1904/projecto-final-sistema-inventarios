package com.ucreativa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.ucreativa.contact.Contact;

public class Invoice {
    private Contact contact;
    private String documentNumber;
    private String date;
    private String dueDate;
    private String filePath;
    private List<Product> items;
    private String purchaseMessage;
    private Map<String, String> customFields;

    private Category category;
    private String internalDescription;
    private String[] tags;
    private Map<Project, Product> projectsByItem;
    private boolean isDraft;


    public Invoice(Contact contact, String documentNumber, String date, String dueDate, String filePath, List<Product> items, String purchaseMessage, Map<String, String> customFields, Category category, String internalDescription, String[] tags, Map<Project, Product> projectsByItem, boolean isDraft) {
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

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
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

    public Map<Project, Product> getProjectsByItem() {
        return projectsByItem;
    }

    public void setProjectsByItem(Map<Project, Product> projectsByItem) {
        this.projectsByItem = projectsByItem;
    }

    public boolean isDraft() {
        return isDraft;
    }

    public void setDraft(boolean draft) {
        isDraft = draft;
    }


    /**
     * @param products: All the products added to the invoice
     * @return: Sum of taxes for all the products
     */
    public double calculateTaxes(List<Item> products){
        return 0;
    }

    /**
     * @param products: All the products added to the invoice
     * @return: Sum of all products' cost without taxes
     */
    public double calculateTotal(List<Item> products){
        return 0;
    }

    /**
     * @return: Sum of all products' cost including the taxes
     */
    public double calculateTotalWithTaxes(){
        return calculateTaxes(items) + calculateTotal(items);
    }

    /**
     * @param item: New product which is added to the invoice
     */
    public void addProduct(Item item){
        this.items.add(item);
    }

    /**
     * @param item: Product which is removed from the invoice
     */
    public void deleteProduct(Item item){
        this.items.remove(item);
    }
}
