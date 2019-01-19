/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class Aftsuite_Schedule_N05C64800B8E11E9BA18F8B36C7485CE
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public Aftsuite_Schedule_N05C64800B8E11E9BA18F8B36C7485CE(IContainer parent, String name) {
		super(parent, name, "N05C64800B8E11E9BA18F8B36C7485CE");
		setThinkMax(2000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("End of datapool reached"), 1, "End of datapool reached"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1, "Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));
		this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(),
				new RPTStopUserEvent("Playback of Mobile or Web UI step has a fatal error"), 0,
				"Playback of Mobile or Web UI step has a fatal error"));

		this.addUserGroup(new UserGroup_1(this));

		this.addUserGroup(new UserGroup_2(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "firefox 1", "A1E91B8FFAB4D8C4F287E13662363066");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "scenario_1", "A1E91B8FFAB4D8CFF287E13662363066") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test_A1E91B8FBF42F360F287E13662363066(this, "A1E91B8FFAB4D8DCF287E13662363066") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

	public class UserGroup_2 extends UserGroup {

		public UserGroup_2(IContainer parent) {
			super(parent, "firefox 2", "A1E91B8FFAB4D8E9F287E13662363066");

			setNumUsers(1.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_2(parent);
		}

		private Container scenario_2(IContainer parent) {
			Container scenario = new Container(parent, "scenario_2", "A1E91B8FFAB4FFB6F287E13662363066") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Wikipedia_Test_A1E91B8FD91E36A0F287E13662363066(this,
							"A1E91B8FFAB4FFC3F287E13662363066") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

}