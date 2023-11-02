package estudos.poo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ExercicioPostComentarios {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static void main(String[] args) {

        Post post1 = new Post();
        post1.setMoment(LocalDateTime.parse("21/06/2018 13:05:44", formatter));
        post1.setTitle("Travelling to New Zealand");
        post1.setContent("I'm going to visit this wonderful country!");
        post1.setLikes(12);
        post1.addComments(new Comment("Have a nice trip!"));
        post1.addComments(new Comment("Wow that's awesome!"));

        Post post2 = new Post();
        post2.setMoment(LocalDateTime.parse("28/07/2018 23:14:19", formatter));
        post2.setTitle("Good night guys");
        post2.setContent("See u tomorrow");
        post2.setLikes(5);
        post2.getComments().add(new Comment("Good night"));
        post2.getComments().add(new Comment("May the Force be with u"));

        System.out.println();
        System.out.println(post1);
        System.out.println(post2);
    }
}

class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post() { }

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComments(Comment comment) {
        comments.add(comment);
    }
    public void removeComments(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = ExercicioPostComentarios.formatter;

        StringBuilder sb = new StringBuilder();
        sb.append(title+ "\n");
        sb.append(likes + " Likes - " + moment.format(formatter) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        comments.forEach(c -> sb.append(c.getText() + '\n'));

        return sb.toString();
    }
}

class Comment {
    private String text;

    public Comment() { }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
