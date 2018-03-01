
public class StartupTimerServiceImpl implements StartupTimerService {

  private long finishedTime;

  @Override
  public long getFinishedTime() {
    return finishedTime;
  }

  @Override
  public void setFinishedTime(long finishedTime) {
    this.finishedTime = finishedTime;
  }
}
