package hi;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    get("/", ctx -> "Welcome to Joobyy!");
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
