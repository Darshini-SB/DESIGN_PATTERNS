class Document implements Prototype {
    private String content;
    private String title;
    
    public Document(String content,String title)
    {
        this.content=content;
        this.title=title;
    }
   
    public void setContent(String content)
    {
        this.content=content;
    }
 
    public void showdetails()
    {
        System.out.println("Document content: "+content);
        System.out.println("Document title: "+title);
    }

    public Document Clone()
    {
        return new Document(this.content,this.title);
    }
}