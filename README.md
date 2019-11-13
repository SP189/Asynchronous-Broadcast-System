# Asynchronous-Broadcast-System
Objective :  To implement asynchronous broadcast model.

Asynchronous broadcast communication model has a client server architecture. In this asynchronous broadcast communication model, all members can receive the messages sent to a group of participants at the time the message was sent. The sender is not blocked until everyone in the group receives the message. It is unblocked as soon as it receives an acknowledgement from the coordinator. If a participant goes offline, then upon reconnection, it will receive messages that were sent when it was offline. The messages sent after threshold time will be permanently lost to the participant. The coordinator manages the group, handles all communication and stores messages for persistence.

At the Participants side :
Each participant has a unique user defined ID. All the messages received by the participant are stored in the message log file. When the participant is offline,all the messages received by a participant should be stored in a file in the order they were received. The participant can do actions like :
Register : Participant has to register with the coordinator specifying its ID, IP address and port number. Upon successful registration, the participant is a member of the group and will begin receiving messages.
Deregister: Participant indicates to the coordinator that it is no longer belongs to the group. 
Disconnect: Participant indicates to the coordinator that it is temporarily going offline.
Reconnect :Participant indicates to the coordinator that it is online and will receive the messages
Message Send : Send messages to all current members. 

At the Coordinator side :
The coordinator manages the group, handles all communication and stores messages. Participants join the group through register command. When the coordinator gets a message it performs the requested action. 

The schematic view or design of the model contains (say) Participant 3 is sending a message to the coordinator and that message will then be received by other members or participants connected to the coordinator. Similarly, other participants of the model can also send message via the coordinator.  
