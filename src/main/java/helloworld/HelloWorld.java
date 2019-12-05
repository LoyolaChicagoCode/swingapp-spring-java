package helloworld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** @author laufer */
public class HelloWorld implements ActionListener {

  private static final String DEFAULT_MESSAGE = "Hello World";

  private String msg;

  public void setMessage(final String msg) {
    this.msg = msg;
  }

  public String getMessage() {
    return msg;
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    System.out.println(getMessage());
  }
}
