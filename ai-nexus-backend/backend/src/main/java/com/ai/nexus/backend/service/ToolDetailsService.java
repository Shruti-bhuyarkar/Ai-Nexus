//package com.ai.nexus.backend.service;
//
//
//import com.ai.nexus.backend.model.ToolDetails;
//import com.ai.nexus.backend.repository.ToolDetailsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ToolDetailsService {
//    @Autowired
//    private  ToolDetailsRepository toolDetailsRepository;
//
//
//    public List<ToolDetails> getAllToolDetails() {
//        return toolDetailsRepository.findAll();
//    }
//
//    public Optional<ToolDetails> getToolDetailById(Long id) {
//        return toolDetailsRepository.findById(id);
//    }
//
//    public ToolDetails createToolDetail(ToolDetails toolDetail) {
//        return toolDetailsRepository.save(toolDetail);
//    }
//
//    public ToolDetails updateToolDetail(Long id, ToolDetails updatedToolDetail) {
//        // Check if the tool detail with the given ID exists
//        if (toolDetailsRepository.existsById(id)) {
//            updatedToolDetail.setId(id);
//            return toolDetailsRepository.save(updatedToolDetail);
//        } else {
//            // Handle the case where the tool detail does not exist
//            throw new RuntimeException("Tool detail with ID " + id + " not found");
//        }
//    }
//
//    public void deleteToolDetail(Long id) {
//        // Check if the tool detail with the given ID exists before deleting
//        if (toolDetailsRepository.existsById(id)) {
//            toolDetailsRepository.deleteById(id);
//        } else {
//            // Handle the case where the tool detail does not exist
//            throw new RuntimeException("Tool detail with ID " + id + " not found");
//        }
//    }
//
//}
