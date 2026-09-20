public class metrics{
    public static void metrics(){
        private long comparisons = 0;
        private int maxDepth = 0;
        private long timeMs=0;

        public void incrementComparisons(){
            this.comparisons++;
        }

        public void trackDepth(int currentDepth){
            if (currentDepth > this.maxDepth){
                this.maxDepth = currentDepth
            }
        }

        public void setTime(long timeMs){
            this.timeMs = timeMs
        }

        public long getComparisons(){
            return comparisons;
        }

        public int getMaxDepth(){
            return maxDepth;
        }

        public long getTimeMs(){
            return timeMs;
        }
    }
}