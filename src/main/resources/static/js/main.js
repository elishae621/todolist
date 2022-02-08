// show delete confirmtion modal and 
// populate modal with data
function showDeleteModal(id) {
    // insert task id into hidden field
    document.querySelector(".delete-form .task-id").value = id;

    // show the modal
    halfmoon.toggleModal("delete-task");
    
}

// show edit modal and
// populate it with data 
function showEditModal(id, content) {
    // insert task id and content into fields 
    document.querySelector(".edit-form .task-id").value = id;
    document.querySelector(".edit-form .task").value = content;

    // show the modal
    halfmoon.toggleModal("edit-task");
}