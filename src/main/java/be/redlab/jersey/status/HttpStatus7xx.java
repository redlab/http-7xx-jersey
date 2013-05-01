/**
 *
 */
package be.redlab.jersey.status;

import javax.ws.rs.core.Response.Status.Family;
import javax.ws.rs.core.Response.StatusType;

/**
 * Status based on https://github.com/joho/7XX-rfc
 *
 * @author redlab
 * @since 20130501
 * @version 1.0.0
 *
 */
public enum HttpStatus7xx implements StatusType {
	/**
	*701 Meh
	*/
	MEH(701,"Meh"),
	/**
	*702 Emacs
	*/
	EMACS(702,"Emacs"),
	/**
	*703 Explosion
	*/
	EXPLOSION(703,"Explosion"),
	/**
	*710 PHP
	*/
	PHP(710,"PHP"),
	/**
	*711 Convenience Store
	*/
	CONVENIENCE_STORE(711,"Convenience Store"),
	/**
	*712 NoSQL
	*/
	NOSQL(712,"NoSQL"),
	/**
	*719 I am not a teapot
	*/
	I_AM_NOT_A_TEAPOT(719,"I am not a teapot"),
	/**
	*720 Unpossible
	*/
	UNPOSSIBLE(720,"Unpossible"),
	/**
	*721 Known Unknowns
	*/
	KNOWN_UNKNOWNS(721,"Known Unknowns"),
	/**
	*722 Unknown Unknowns
	*/
	UNKNOWN_UNKNOWNS(722,"Unknown Unknowns"),
	/**
	*723 Tricky
	*/
	TRICKY(723,"Tricky"),
	/**
	*724 This line should be unreachable
	*/
	THIS_LINE_SHOULD_BE_UNREACHABLE(724,"This line should be unreachable"),
	/**
	*725 It works on my machine
	*/
	IT_WORKS_ON_MY_MACHINE(725,"It works on my machine"),
	/**
	*726 It's a feature, not a bug
	*/
	IT_IS_A_FEATURE_NOT_A_BUG(726,"It's a feature, not a bug"),
	/**
	*727 32 bits is plenty
	*/
	_32_BITS_IS_PLENTY(727,"32 bits is plenty"),
	/**
	*731 Fucking Rubygems
	*/
	FUCKING_RUBYGEMS(731,"Fucking Rubygems"),
	/**
	*732 Fucking Unicde
	*/
	FUCKING_UNICDE(732,"Fucking Unicde"),
	/**
	*733 Fucking Deadlocks
	*/
	FUCKING_DEADLOCKS(733,"Fucking Deadlocks"),
	/**
	*734 Fucking Deferreds
	*/
	FUCKING_DEFERREDS(734,"Fucking Deferreds"),
	/**
	*735 Fucking IE
	*/
	FUCKING_IE(735,"Fucking IE"),
	/**
	*736 Fucking Race Conditions
	*/
	FUCKING_RACE_CONDITIONS(736,"Fucking Race Conditions"),
	/**
	*737 FuckThreadsing
	*/
	FUCKTHREADSING(737,"FuckThreadsing"),
	/**
	*738 Fucking Bundler
	*/
	FUCKING_BUNDLER(738,"Fucking Bundler"),
	/**
	*739 Fucking Windows
	*/
	FUCKING_WINDOWS(739,"Fucking Windows"),
	/**
	*740 Computer says no
	*/
	COMPUTER_SAYS_NO(740,"Computer says no"),
	/**
	*741 Compiling
	*/
	COMPILING(741,"Compiling"),
	/**
	*742 A kitten dies
	*/
	A_KITTEN_DIES(742,"A kitten dies"),
	/**
	*743 I thought I knew regular expressions
	*/
	I_THOUGHT_I_KNEW_REGULAR_EXPRESSIONS(743,"I thought I knew regular expressions"),
	/**
	*744 Y U NO write integration tests?
	*/
	Y_U_NO_WRITE_INTEGRATION_TESTS(744,"Y U NO write integration tests?"),
	/**
	*745 I don't always test my code, but when I do I do it in production
	*/
	I_DO_NOT_ALWAYS_TEST_MY_CODE_BUT_WHEN_I_DO_I_DO_IT_IN_PRODUCTION(745,"I don't always test my code, but when I do I do it in production"),
	/**
	*746 Missed Ballmer Peak
	*/
	MISSED_BALLMER_PEAK(746,"Missed Ballmer Peak"),
	/**
	*747 Motherfucking Snakes on the Motherfucking Plane
	*/
	MOTHERFUCKING_SNAKES_ON_THE_MOTHERFUCKING_PLANE(747,"Motherfucking Snakes on the Motherfucking Plane"),
	/**
	*748 Confounded by Ponies
	*/
	CONFOUNDED_BY_PONIES(748,"Confounded by Ponies"),
	/**
	*749 Reserved for Chuck Norris
	*/
	RESERVED_FOR_CHUCK_NORRIS(749,"Reserved for Chuck Norris"),
	/**
	*750 Didn't bother to compile it
	*/
	DID_NOT_BOTHER_TO_COMPILE_IT(750,"Didn't bother to compile it"),
	/**
	*753 Syntax Error
	*/
	SYNTAX_ERROR(753,"Syntax Error"),
	/**
	*754 Too many semi-colons
	*/
	TOO_MANY_SEMI_COLONS(754,"Too many semi-colons"),
	/**
	*755 Not enough semi-colons
	*/
	NOT_ENOUGH_SEMI_COLONS(755,"Not enough semi-colons"),
	/**
	*759 Unexpected T_PAAMAYIM_NEKUDOTAYIM
	*/
	UNEXPECTED_T_PAAMAYIM_NEKUDOTAYIM(759,"Unexpected T_PAAMAYIM_NEKUDOTAYIM"),
	/**
	*761 Hungover
	*/
	HUNGOVER(761,"Hungover"),
	/**
	*762 Stoned
	*/
	STONED(762,"Stoned"),
	/**
	*763 Under-Caffeinated
	*/
	UNDER_CAFFEINATED(763,"Under-Caffeinated"),
	/**
	*764 Over-Caffeinated
	*/
	OVER_CAFFEINATED(764,"Over-Caffeinated"),
	/**
	*765 Railscamp
	*/
	RAILSCAMP(765,"Railscamp"),
	/**
	*766 Sober
	*/
	SOBER(766,"Sober"),
	/**
	*767 Drunk
	*/
	DRUNK(767,"Drunk"),
	/**
	*768 Accidentally Took Sleeping Pills Instead Of Migraine Pills During Crunch Week
	*/
	ACCIDENTALLY_TOOK_SLEEPING_PILLS_INSTEAD_OF_MIGRAINE_PILLS_DURING_CRUNCH_WEEK(768,"Accidentally Took Sleeping Pills Instead Of Migraine Pills During Crunch Week"),
	/**
	*769 Questionable Maturity Level
	*/
	QUESTIONABLE_MATURITY_LEVEL(769,"Questionable Maturity Level"),
	/**
	*771 Cached for too long
	*/
	CACHED_FOR_TOO_LONG(771,"Cached for too long"),
	/**
	*772 Not cached long enough
	*/
	NOT_CACHED_LONG_ENOUGH(772,"Not cached long enough"),
	/**
	*773 Not cached at all
	*/
	NOT_CACHED_AT_ALL(773,"Not cached at all"),
	/**
	*774 Why was this cached?
	*/
	WHY_WAS_THIS_CACHED(774,"Why was this cached?"),
	/**
	*776 Error on the Exception
	*/
	ERROR_ON_THE_EXCEPTION(776,"Error on the Exception"),
	/**
	*777 Coincidence
	*/
	COINCIDENCE(777,"Coincidence"),
	/**
	*778 Off By One Error
	*/
	OFF_BY_ONE_ERROR(778,"Off By One Error"),
	/**
	*779 Off By Too Many To Count Error
	*/
	OFF_BY_TOO_MANY_TO_COUNT_ERROR(779,"Off By Too Many To Count Error"),
	/**
	*780 Project owner not responding
	*/
	PROJECT_OWNER_NOT_RESPONDING(780,"Project owner not responding"),
	/**
	*781 Operations
	*/
	OPERATIONS(781,"Operations"),
	/**
	*782 QA
	*/
	QA(782,"QA"),
	/**
	*783 It was a customer request, honestly
	*/
	IT_WAS_A_CUSTOMER_REQUEST_HONESTLY(783,"It was a customer request, honestly"),
	/**
	*784 Management, obviously
	*/
	MANAGEMENT_OBVIOUSLY(784,"Management, obviously"),
	/**
	*785 TPS Cover Sheet not attached
	*/
	TPS_COVER_SHEET_NOT_ATTACHED(785,"TPS Cover Sheet not attached"),
	/**
	*786 Try it now
	*/
	TRY_IT_NOW(786,"Try it now"),
	/**
	*791 The Internet shut down due to copyright restrictions.
	*/
	THE_INTERNET_SHUT_DOWN_DUE_TO_COPYRIGHT_RESTRICTIONS(791,"The Internet shut down due to copyright restrictions."),
	/**
	*792 Climate change driven catastrophic weather event
	*/
	CLIMATE_CHANGE_DRIVEN_CATASTROPHIC_WEATHER_EVENT(792,"Climate change driven catastrophic weather event"),
	/**
	*793 Zombie Apocalypse
	*/
	ZOMBIE_APOCALYPSE(793,"Zombie Apocalypse"),
	/**
	*794 Someone let PG near a REPL
	*/
	SOMEONE_LET_PG_NEAR_A_REPL(794,"Someone let PG near a REPL"),
	/**
	*797 This is the last page of the Internet. Go back
	*/
	THIS_IS_THE_LAST_PAGE_OF_THE_INTERNET_GO_BACK(797,"This is the last page of the Internet. Go back"),
	/**
	*799 End of the world
	*/
	END_OF_THE_WORLD(799,"End of the world");
;

	private int code;
	private String reason;

	private HttpStatus7xx(final int code, final String reason) {
		this.code = code;
		this.reason = reason;

	}

	@Override
	public int getStatusCode() {
		return code;
	}

	@Override
	public Family getFamily() {
		return Family.OTHER;
	}

	@Override
	public String getReasonPhrase() {
		return reason;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return reason;

	}

}
