import utils.Colors

void info(String iMessage, Bool isTextBold=false){
        String style = isTextBold ? Colors.BOLD : ""
        println("${style}${Colors.BLUE}[INFO] - ${iMessage}${Colors.RESET}")
    }

void warning(String iMessage, Bool isTextBold=false){
    String style = isTextBold ? Colors.BOLD : ""
    println("${style}${Colors.ORANGE}[WARNING] - ${iMessage}${Colors.RESET}")
}

void error(String iMessage, Bool isTextBold=false){
    String style = isTextBold ? Colors.BOLD : ""
    println("${style}${Colors.RED}[ERROR] - ${iMessage}${Colors.RESET}")
}

void debug(String iMessage, Bool isTextBold=false){
    String style = isTextBold ? Colors.BOLD : ""
    println("${style}${Colors.BLACK}[DEBUG] - ${iMessage}${Colors.RESET}")
}

void system(String iMessage, Bool isTextBold=false){
    String style = isTextBold ? Colors.BOLD : ""
    println("${style}${Colors.YELLOW}[SYSTEM] - ${iMessage}${Colors.RESET}")
}