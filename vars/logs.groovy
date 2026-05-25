import utils.Colors

void info(String iMessage, boolean isTextBold=false){
        String style = isTextBold ? Colors.BOLD : ""
        println("${style}${Colors.BLUE}[INFO] - ${iMessage}${Colors.RESET}")
    }

void warning(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? Colors.BOLD : ""
    println("${style}${Colors.ORANGE}[WARNING] - ${iMessage}${Colors.RESET}")
}

void error(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? Colors.BOLD : ""
    println("${style}${Colors.RED}[ERROR] - ${iMessage}${Colors.RESET}")
}

void debug(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? Colors.BOLD : ""
    println("${style}${Colors.BLACK}[DEBUG] - ${iMessage}${Colors.RESET}")
}

void system(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? Colors.BOLD : ""
    println("${style}${Colors.YELLOW}[SYSTEM] - ${iMessage}${Colors.RESET}")
}