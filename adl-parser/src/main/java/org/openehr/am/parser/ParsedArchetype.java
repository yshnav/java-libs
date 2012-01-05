package org.openehr.am.parser;

import org.openehr.am.archetype.constraintmodel.ArchetypeConstraint;

/**
 * A parsed archetype object instance valid according to ADL syntax
 * 
 * It needs to be further validated against according RM/AOM classes
 * 
 * @author rong.chen
 *
 */
public class ParsedArchetype extends Parsed {
	
	// default constructor
	public ParsedArchetype(){		
	}	
	
	/**
	 * @return the archetypeId
	 */
	public String getArchetypeId() {
		return archetypeId;
	}
	/**
	 * @param archetypeId the archetypeId to set
	 */
	public void setArchetypeId(String archetypeId) {
		this.archetypeId = archetypeId;
	}
	/**
	 * @return the parentArchetypeId
	 */
	public String getParentArchetypeId() {
		return parentArchetypeId;
	}
	/**
	 * @param parentArchetypeId the parentArchetypeId to set
	 */
	public void setParentArchetypeId(String parentArchetypeId) {
		this.parentArchetypeId = parentArchetypeId;
	}
	/**
	 * @return the conceptId
	 */
	public String getConceptId() {
		return conceptId;
	}
	/**
	 * @param conceptId the conceptId to set
	 */
	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}
	/**
	 * @return the language
	 */
	public ContentObject getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(ContentObject language) {
		this.language = language;
	}
	/**
	 * @return the description
	 */
	public ContentObject getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(ContentObject description) {
		this.description = description;
	}
	/**
	 * @return the definition
	 */
	public ArchetypeConstraint getDefinition() {
		return definition;
	}
	/**
	 * @param definition the definition to set
	 */
	public void setDefinition(ArchetypeConstraint definition) {
		this.definition = definition;
	}
	/**
	 * @return the ontology
	 */
	public ContentObject getOntology() {
		return ontology;
	}
	/**
	 * @param ontology the ontology to set
	 */
	public void setOntology(ContentObject ontology) {
		this.ontology = ontology;
	}
	/**
	 * @return the annotations
	 */
	public ContentObject getAnnotations() {
		return annotations;
	}
	/**
	 * @param annotations the annotations to set
	 */
	public void setAnnotations(ContentObject annotations) {
		this.annotations = annotations;
	}
	/**
	 * @return the revisionHistory
	 */
	public ContentObject getRevisionHistory() {
		return revisionHistory;
	}
	/**
	 * @param revisionHistory the revisionHistory to set
	 */
	public void setRevisionHistory(ContentObject revisionHistory) {
		this.revisionHistory = revisionHistory;
	}

	private String archetypeId;
	private String parentArchetypeId;
	private String conceptId;
	private ContentObject language;
	private ContentObject description;
	private ArchetypeConstraint definition;
	private ContentObject ontology;
	private ContentObject annotations;
	private ContentObject revisionHistory;
}
