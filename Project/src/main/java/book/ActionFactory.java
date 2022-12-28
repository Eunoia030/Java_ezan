package book;

import member.IdCheckAction;
import member.IdCheckFormAction;
import member.MemberJoinAction;
import member.MemberJoinFormAction;
import member.MemberListAction;
import member.MemberLoginAction;
import member.MemberLoginFormAction;
import member.MemberLogoutAction;
import member.MemberMyPageAction;
import member.UserManagerAction;
import member.UserManagerFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("command:" + command);
		
		if (command.equals("book_list")) {
			action = new BookListAction();
		} else if (command.equals("book_register_form")) {
			action = new BookRegisterFormAction();
		} else if (command.equals("book_register")) {
			action = new BookRegisterAction();
		} else if (command.equals("book_detail")) {
			action = new BookDetailAction();
		} else if (command.equals("book_update_form")) {
			action = new BookUpdateFormAction();
		} else if (command.equals("book_update")) {
			action = new BookUpdateAction();
		} else if (command.equals("book_delete")) {
			action = new BookDeleteAction();
		} else if (command.equals("book_check")) {
			action = new BookCheckAction();
		} else if (command.equals("member_login_form")) {
			action = new MemberLoginFormAction();
		} else if (command.equals("member_login")) {
			action = new MemberLoginAction();
		} else if (command.equals("book_category_viewer")) {
			action = new BookCategoryViewerAction();
		} else if (command.equals("book_main")) {
			action = new BookMainAction();
		} else if (command.equals("member_myPage")) {
			action = new MemberMyPageAction();
		} else if (command.equals("member_logout")) {
			action = new MemberLogoutAction();
		} else if (command.equals("member_list")) {
			action = new MemberListAction();
		} else if (command.equals("book_search")) {
			action = new BookSearchAction();
		} else if (command.equals("member_info_form")) {
			action = new UserManagerFormAction();
		} else if (command.equals("member_info")) {
			action = new UserManagerAction();
		} else if (command.equals("book_check_delete")) {
			action = new BookCheckDeleteAction();
		} else if (command.equals("member_join_form")) {
			action = new MemberJoinFormAction();
		} else if (command.equals("member_join")) {
			action = new MemberJoinAction();
		} else if (command.equals("id_check_form")) {
			action = new IdCheckFormAction();
		} else if (command.equals("id_check")) {
			action = new IdCheckAction();
		}
		return action;
	}
}	
