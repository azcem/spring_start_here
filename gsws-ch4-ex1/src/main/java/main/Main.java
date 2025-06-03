package main;

import configuration.ProjectConfiguration;
import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Assem");
        comment.setText("This is a comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
