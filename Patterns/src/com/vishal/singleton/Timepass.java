/*package com.vishal.singleton;

import java.nio.file.FileSystems;

class WatchServiceTask2(notifyActor: ActorRef) extends Runnable with Logging {
    private val watchService = FileSystems.getDefault.newWatchService()
  
    def run() {
        try {
            while (!Thread.currentThread().isInterrupted) {
                val key = watchService.take()
                //coming soon...
                key.reset()
            }
        } catch {
            case e: InterruptedException =>
                logger.info("Interrupting, bye!")
        } finally {
            watchService.close();
        }
    }
}
*/