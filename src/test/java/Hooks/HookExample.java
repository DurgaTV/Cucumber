/*
 * package Hooks;
 * 
 * import io.cucumber.java.After; import io.cucumber.java.Before; import
 * io.cucumber.java.Scenario;
 * 
 * public class HookExample {
 * 
 * @Before("@smoke") public void beforeHookExecution(Scenario sc) {
 * System.out.println("Before hook statement1");
 * System.out.println(sc.getUri()); System.out.println(sc.getLine());
 * System.out.println(sc.getSourceTagNames());
 * System.out.println(sc.getStatus()); }
 * 
 * @After(order=2) public void afterHookExecution() {
 * System.out.println("After hook statement"); }
 * 
 * @Before(order=5) public void befHookExecution() {
 * System.out.println("before each hook statement2"); }
 * 
 * @After(order=1) public void aftHookExecution() {
 * System.out.println("After each hook statement2"); } }
 */