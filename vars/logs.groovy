import utils.colors

void info(String iMessage, boolean isTextBold=false){
        String style = isTextBold ? colors.BOLD : ""
        println("${style}${colors.BLUE}[INFO] - ${iMessage}${colors.RESET}")
    }

void warning(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.ORANGE}[WARNING] - ${iMessage}${colors.RESET}")
}

void error(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.RED}[ERROR] - ${iMessage}${colors.RESET}")
}

void debug(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.BLACK}[DEBUG] - ${iMessage}${colors.RESET}")
}

void system(String iMessage, boolean isTextBold=false){
    String style = isTextBold ? colors.BOLD : ""
    println("${style}${colors.YELLOW}[SYSTEM] - ${iMessage}${colors.RESET}")
}